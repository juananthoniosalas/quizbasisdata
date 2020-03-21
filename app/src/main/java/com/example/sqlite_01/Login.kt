package com.example.sqlite_01

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        //method untuk membuat login tanpa database

        //btnlogin yang berupa id akan di fungsikan pada setonclicklistener
        btnLogin.setOnClickListener {
            //deklarasi email yang ketika dimasukkan input email  dari form login
            val username = inputUsername.text.toString()
            //deklarasi password yang ketika dimasukkan input password  dari form login
            val password = inputPassword.text.toString()
            //karena tidak menggunakan database sebagai media untuk membuat login, maka disini saya menggunakan metode if else (dummy)
            //apa itu dummy ? dummy merupakan semacam tiruan seperti aslinya disini yang merupakan tiruannya adalah email dan password yang kita definisikan email
            // dan passwordnya dibawah ini sehingga yang boleh masuk ke activity main atau dashboard merupakan dummy yang kita definisikan menggunakan if else
            if (username.isEmpty()|| password.isEmpty()) {
                Toast.makeText(this, "Please Insert Email and Password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            //dibawah ini merupakan deklarasi dummynya dimana pada email login harus menggunakan juananthoniosalas@gmail.com dan passwordnya adalah juan123
            if(username == "juan123" || password == "123"){
                val progressDialog = ProgressDialog(this,
                    R.style.AppTheme)
                progressDialog.isIndeterminate = true
                progressDialog.setMessage("Loading...")
                progressDialog.show()
                //ketika sudah selesai melakukan login maka activity akan ke intent(pindah) halaman ke activitymain
                val intent = Intent (this,MainActivity::class.java)
                startActivity(intent)
                finish()
            }
            //sangat tidak dianjurkan memakai dummy untuk aplikasi yang benar benar kompleks dikarenakan dummy sendiri merupakan tiruan yang tidak ada proteksinya
        }
    }
}
