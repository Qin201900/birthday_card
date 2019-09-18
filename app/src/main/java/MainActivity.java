import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {
private  static  final  String TAG="kkk";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abc);
        TextView out=(TextView)findViewById(R.id.text2);
        out.setText("kkkk");
        Button btn =findViewById(R.id.button2) ;
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
    public void onClicko(View v){


    }

}
