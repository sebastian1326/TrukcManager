package com.lopezing.trukcmanager.ui.userin

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lopezing.trukcmanager.data.ResourceRemote
import com.lopezing.trukcmanager.data.UserRepository
import com.lopezing.trukcmanager.model.User
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class UserInViewModel : ViewModel() {
    //@OptIn(DelicateCoroutinesApi::class)
    private val userRepository= UserRepository()
    private val _msgError : MutableLiveData<String?> = MutableLiveData()
    val msgError : LiveData<String?> = _msgError

    private val _registerSuccess : MutableLiveData<String?> = MutableLiveData()
    val registerSuccess : LiveData<String?> = _registerSuccess

    fun checkIn(
        email: String,
        password: String,
        cpassword: String,
        name: String,
        cell: String,
        placa: String
    ) {
        if (email.isEmpty() || password.isEmpty() || cpassword.isEmpty() || name.isEmpty() || cell.isEmpty() || placa.isEmpty())
            _msgError.value="Porfavor digite todos los campos!"
        else
            if (password==cpassword) {
                //TODO:llamar al UserRepository
                Log.d("check", "true")
                if (password.length < 6)
                    _msgError.value="la contraseña debe tener mas de 6 digitos "
                else {
                    GlobalScope.launch(Dispatchers.IO) {
                        val result=userRepository.registerUser(email, password)
                        result.let { resourceRemote ->
                            when (resourceRemote) {
                                is ResourceRemote.success -> {
                                    _registerSuccess.postValue(result.data)
                                }
                                is ResourceRemote.Error -> {
                                    when (result.message){
                                        "The email address is badly formatted." ->
                                            _msgError.postValue("La Email esta mal escrito.")
                                        "The email address is already in use by another account." ->
                                            _msgError.postValue("El Email ya existe.")
                                        "A network error (such as timeout, interrupted connection or unreachable host) has occurred."->
                                            _msgError.postValue("Error de red, verifique su conexion.")
                                        else ->_msgError.postValue("Error.")
                                    }
                                }
                                else ->{
                                    //don't use
                                }
                            }
                        }
                    }

                }
            }
            else
                _msgError.value="Contraseñas no coinciden, verifique que sean iguales"
    }

    fun createUser(uid: String?, name: String, email: String, cell: String, placa: String) {
        val user= User(uid,name,email,cell,placa)
    }
    // TODO: Implement the ViewModel
}