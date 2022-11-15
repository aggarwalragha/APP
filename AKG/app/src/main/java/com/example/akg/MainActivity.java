package com.example.akg;
//import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;
public class MainActivity extends AppCompatActivity {
            protected void oncreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openActivity(View view){
  Toast.makeText(this,"Welcome to CCC",Toast.LENGTH_SHORT).show();
  Intent intent =new Intent(this,MainActivity2.class);
   startActivity(intent);
   }
    VideoView videoview;
    private Button button;
    private TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview=findViewById(R.id.textView2);
        textview.setText("AJAY KUMAR GARG ENGINEERING COLLEGE");
        textview=findViewById(R.id.textView);
        textview.setText("The college was established in 1998 and offers B.Tech Courses in seven disciplines of Engineering.Spread over 40 acre campus, AKGEC has excellent infrastructure with well-planned complexes for each department having spacious laboratories, class rooms equipped with state-of-the-art teaching aids, department libraries and faculty cabins. Departmental laboratories have the latest equipment and relevant licensed software. The college has state-of-the-art computing facilities with over 1400 computers networked through broadband for Internet access. The college has a fully automated central library with over 1,00,000 books, national/international journals including e-journals and multimedia resources.AKTU Chancellor Award for best performance across all branches bagged by AKGEC students for five consecutive years. Large number of University merit positions with Gold, Silver and Bronze medals bagged by AKGEC students every year.");
      videoview=findViewById(R.id.videoview);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.bg1);
        videoview.setVideoURI(uri);
        videoview.start();
        videoview.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });
        button.setText("Cloud Computing Cell");
        button = findViewById(R.id.button3);
        button.setText("ABOUT US");
        button = findViewById(R.id.button1);
        button.setText("SOCIETY");
        button = findViewById(R.id.button2);
        button.setText("HOME");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Welcome to AKG Society", Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    protected void onPostResume(){
        videoview.resume();
        super.onPostResume();
    }
    @Override
    protected void onRestart(){
        videoview.start();
        super.onRestart();
    }
    @Override
    protected void onPause(){
        videoview.suspend();
        super.onPause();
    }
    @Override
    protected void onDestroy(){
        videoview.stopPlayback();
        super.onDestroy();
    }
}