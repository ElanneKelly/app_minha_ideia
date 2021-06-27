package elanne.kelly.appminhaideia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class SplashActivity extends AppCompatActivity {

    String TAG = "APP_MINHA_IDEIA";

    @Override
   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Log.d(TAG, "onCreate: Tela Splash carregada...");

        trocaTela();
    }
    private  void trocaTela(){

        Log.d(TAG, "trocaTela: Mudando de tela...");

        Intent TrocarDeTela =  new Intent(SplashActivity.this, MainActivity.class);
        startActivity(TrocarDeTela);
        finish();

    }
}




