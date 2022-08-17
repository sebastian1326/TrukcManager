package com.lopezing.trukcmanager.ui.ingresar

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lopezing.trukcmanager.data.ResourceRemote
import com.lopezing.trukcmanager.data.UserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class IngresarViewModel : ViewModel() {
    private val _registerSuccess : MutableLiveData<String?> = MutableLiveData()
    val registerSuccess : LiveData<String?> = _registerSuccess
    private val userRepository= UserRepository()
    private val _msgError : MutableLiveData<String?> = MutableLiveData()
    val msgError : LiveData<String?> = _msgError
    fun inLoadingUser(email: String, password: String) {
        if (email.isEmpty() || password.isEmpty())
            _msgError.value = "Porfavor digite todos los campos!"
        else
            if (password.length < 6)
                _msgError.value="la contraseña debe tener mas de 6 digitos "
            else {
                GlobalScope.launch(Dispatchers.IO) {
                    val result = userRepository.IngresarUser(email, password)
                    result.let { resourceRemote ->
                        when (resourceRemote) {
                            is ResourceRemote.success -> {
                                _registerSuccess.postValue(result.data)
                            }
                            is ResourceRemote.Error -> {
                                when (result.message) {
                                    "The email address is badly formatted." ->
                                        _msgError.postValue("La Email esta mal escrito.")
                                    //"The email address is already in use by another account." ->
                                        //_msgError.postValue("El Email ya existe.")
                                    "A network error (such as timeout, interrupted connection or unreachable host) has occurred." ->
                                        _msgError.postValue("Error de red, verifique su conexion.")
                                    "The password is invalid or the user does not have a password."->
                                        _msgError.postValue("Contraseña incorrecta")
                                    "There is no user record corresponding to this identifier. The user may have been deleted." ->
                                        _msgError.postValue("Correo no registrado")
                                    else -> _msgError.postValue("Error.")
                                }
                            }
                            else -> {
                                //don't use
                            }
                        }
                    }
                }
            }
    } // TODO: Implement the ViewModel
}