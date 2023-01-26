package com.example.optikal_99

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.optikal_99.databinding.ActivityTampilanLoginBinding
import com.google.firebase.auth.FirebaseAuth

class TampilanLogin:AppCompatActivity() {

    lateinit var binding: ActivityTampilanLoginBinding
    lateinit var auth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityTampilanLoginBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.ToRegister.setOnClickListener {
            val intent = Intent(this,TampilanRegistrasi::class.java)
            startActivity(intent)
        }

        auth = FirebaseAuth.getInstance()

        binding.BtnLogin.setOnClickListener {
            val email = binding.EmailLogin.text.toString()
            val password = binding.PasswordLogin.text.toString()

            //validasi Email
            if (email.isEmpty()){
                binding.EmailLogin.error = "Email Harus Diisi"
                binding.EmailLogin.requestFocus()
                return@setOnClickListener
            }

            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                binding.EmailLogin.error = "Email Tidak Valid"
                binding.EmailLogin.requestFocus()
                return@setOnClickListener
            }
            //validasi Password
            if (password.isEmpty()){
                binding.PasswordLogin.error = "Password Harus Diisi"
                binding.PasswordLogin.requestFocus()
                return@setOnClickListener
            }


            LoginFirebase(email,password)
        }
    }

    private fun LoginFirebase(email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) {
                if (it.isSuccessful){
                    Toast.makeText(this, "Selamat Datang Di Optical 99 $email", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this,HalamanUtama::class.java)
                    startActivity(intent)
                }else{
                    Toast.makeText(this, "${it.exception?.message}", Toast.LENGTH_SHORT).show()
                }
            }
    }
}