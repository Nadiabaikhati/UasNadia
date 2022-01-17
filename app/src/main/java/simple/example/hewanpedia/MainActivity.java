package simple.example.hewanpedia;

import static simple.example.hewanpedia.R.id.btnKelinci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnKucing,btnAnjing,btnKelinci;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnKucing = findViewById(R.id.btn_buka_ras_kucing);
        btnKelinci = (ImageButton) (btnKelinci);
        btnAnjing = findViewById(R.id.btn_buka_ras_anjing);
        btnKucing.setOnClickListener(view -> bukaGaleri("Kucing"));
        btnKelinci.setOnClickListener(view -> bukaGaleri("Kelinci"));
        btnAnjing.setOnClickListener(view -> bukaGaleri("Anjing"));
    }



    private void bukaGaleri(String jenisHewan) {
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this, DaftarHewanActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
        startActivity(intent);
    }

}