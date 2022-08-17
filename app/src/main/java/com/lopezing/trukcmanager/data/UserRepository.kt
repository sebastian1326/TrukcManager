package com.lopezing.trukcmanager.data

import android.util.Log
import com.google.firebase.FirebaseNetworkException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthException
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.tasks.await

class UserRepository {


    private var auth: FirebaseAuth= Firebase.auth
    suspend fun registerUser(email: String, password: String):ResourceRemote<String?> {
        return try {
            val result= auth.createUserWithEmailAndPassword(email, password).await()
            ResourceRemote.success(data = result.user?.uid)
        }catch (e: FirebaseAuthException){
            Log.e("Register",e.localizedMessage)
            ResourceRemote.Error(message=e.localizedMessage)
        }catch (e: FirebaseNetworkException){
            Log.e("Register",e.localizedMessage)
            ResourceRemote.Error(message = e.localizedMessage)
        }
    }
    suspend fun IngresarUser(email: String, password: String):ResourceRemote<String?> {
        return try {
            val result= auth.signInWithEmailAndPassword(email, password).await()
            ResourceRemote.success(data = result.user?.uid)
        }catch (e: FirebaseAuthException){
            Log.e("Register",e.localizedMessage)
            ResourceRemote.Error(message=e.localizedMessage)
        }catch (e: FirebaseNetworkException){
            Log.e("Register",e.localizedMessage)
            ResourceRemote.Error(message = e.localizedMessage)
        }
    }
}