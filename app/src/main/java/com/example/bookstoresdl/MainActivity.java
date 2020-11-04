
package com.example.bookstoresdl;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.widget.Button;

        import com.example.bookstoresdl.R;

        import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity {
    private Button allbooks,novels,storybooks,studybooks,about;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
    }

    private void initialize() {
        allbooks = findViewById(R.id.AllBooks);
        novels = findViewById(R.id.Novels);
        storybooks = findViewById(R.id.StoryBooks);
        studybooks = findViewById(R.id.StudyBooks);
        about = findViewById(R.id.About);

    }
}







