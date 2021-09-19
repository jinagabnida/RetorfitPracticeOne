package org.techtown.retorfitpracticeone

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val serverInterface: ServerInterface = retrofit.create(ServerInterface::class.java) 서버 클라이언트 클래스에서 선언*/

        val call: Call<PostModel> = ServerClient.getServerInterface().getPosts("12")

        call.enqueue(object : Callback<PostModel> {
            override fun onResponse(
                call: Call<PostModel>,
                response: Response<PostModel>
            ) {
                if (response.isSuccessful){
                    val postModel : PostModel = response.body()!!
                    findViewById<TextView>(R.id.userIdTv).text = postModel.USERID.toString()
                    findViewById<TextView>(R.id.idTv).text = postModel.id.toString()
                    findViewById<TextView>(R.id.titleTv).text = postModel.title
                    findViewById<TextView>(R.id.bodyTv).text = postModel.body

                } else{
                    Log.d(TAG,response.code().toString())
                }
            }

            override fun onFailure(call: Call<PostModel>, t: Throwable) {
                t.printStackTrace()
            }

        })
/*{
            /*override fun onResponse(call: Call<List<PostModel>>, response: Response<List<PostModel>>) {
                Log.e("aa",response.body().toString())
            }

            override fun onFailure(call: Call<List<PostModel>>, t: Throwable) {

            }

        })*/

    }
}
 */
    }
}