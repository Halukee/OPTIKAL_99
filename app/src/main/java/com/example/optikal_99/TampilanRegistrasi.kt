package com.example.optikal_99

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import com.example.optikal_99.databinding.ActivityTampilanRegistrasiBinding
import com.google.firebase.auth.FirebaseAuth

class TampilanRegistrasi:AppCompatActivity() {

    lateinit var binding: ActivityTampilanRegistrasiBinding
    lateinit var auth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityTampilanRegistrasiBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()

        binding.BtnRegister.setOnClickListener {
            val email = binding.EmailRegister.text.toString()
            val password = binding.PasswordRegister.text.toString()

            //validasi Email
            if (email.isEmpty()){
                binding.EmailRegister.error = "Email Harus Terisi"
                binding.EmailRegister.requestFocus()
                return@setOnClickListener
            }

            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                binding.EmailRegister.error = "Email Tidak Benar"
                binding.EmailRegister.requestFocus()
                return@setOnClickListener
            }
            //validasi Password
            if (password.isEmpty()){
                binding.PasswordRegister.error = "Password Harus Terisi"
                binding.PasswordRegister.requestFocus()
                return@setOnClickListener
            }
            if (password.length < 8){
                binding.PasswordRegister.error = "Password Minimal 8 Karakter"
                binding.PasswordRegister.requestFocus()
                return@setOnClickListener
            }

            RegisterFirebase(email,password)
        }
    }

    private fun RegisterFirebase(email: String, password: String) {
        auth.createUserWithEmailAndPassword(email,password)
            .addOnCompleteListener(this) {
                if (it.isSuccessful){
                    Toast.makeText(this, "Register Berhasil", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this,TampilanLogin::class.java)
                    startActivity(intent)
                }else{
                    Toast.makeText(this, "${it.exception?.message}", Toast.LENGTH_SHORT).show()
                }
            }
    }

}
