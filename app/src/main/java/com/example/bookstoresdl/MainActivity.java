
package com.example.bookstoresdl;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.recyclerview.widget.RecyclerView;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnAllBooks, btnNovels, btnManga, btnStudyBooks, btnAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();

        btnManga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MangaActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initialize() {
        btnAllBooks = findViewById(R.id.AllBooks);
        btnNovels = findViewById(R.id.Novels);
        btnManga = findViewById(R.id.Manga);
        btnStudyBooks = findViewById(R.id.StudyBooks);
        btnAbout = findViewById(R.id.About);
    }
}







