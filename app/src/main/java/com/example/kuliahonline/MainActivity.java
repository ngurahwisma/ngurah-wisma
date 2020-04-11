package com.example.kuliahonline;

        import android.os.Bundle;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.recyclerview.widget.LinearLayoutManager;
        import androidx.recyclerview.widget.RecyclerView;

        import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MobilAdapter adapter;
    private ArrayList<Mobil> mobilArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new MobilAdapter(mobilArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    void addData(){
        mobilArrayList = new ArrayList<>();
        mobilArrayList.add(new Mobil("Kijang", "Kapsul", "Dk 12345 kw"));
        mobilArrayList.add(new Mobil("jazz", "Honda", "Dk 7473 kd"));
        mobilArrayList.add(new Mobil("Brio", "Honda", "Dk 2345 kp"));
        mobilArrayList.add(new Mobil("Hrv", "Honda", "Dk 2143 kl"));
        mobilArrayList.add(new Mobil("Kijang", "Kapsul", "Dk 12345 kw"));
        mobilArrayList.add(new Mobil("jazz", "Honda", "Dk 7473 kd"));
        mobilArrayList.add(new Mobil("Brio", "Honda", "Dk 2345 kp"));
        mobilArrayList.add(new Mobil("Hrv", "Honda", "Dk 2143 kl"));
        mobilArrayList.add(new Mobil("Kijang", "Kapsul", "Dk 12345 kw"));
        mobilArrayList.add(new Mobil("jazz", "Honda", "Dk 7473 kd"));
        mobilArrayList.add(new Mobil("Brio", "Honda", "Dk 2345 kp"));
        mobilArrayList.add(new Mobil("Hrv", "Honda", "Dk 2143 kl"));
        mobilArrayList.add(new Mobil("Kijang", "Kapsul", "Dk 12345 kw"));
        mobilArrayList.add(new Mobil("jazz", "Honda", "Dk 7473 kd"));
        mobilArrayList.add(new Mobil("Brio", "Honda", "Dk 2345 kp"));
        mobilArrayList.add(new Mobil("Hrv", "Honda", "Dk 2143 kl"));
        mobilArrayList.add(new Mobil("Kijang", "Kapsul", "Dk 12345 kw"));
        mobilArrayList.add(new Mobil("jazz", "Honda", "Dk 7473 kd"));
        mobilArrayList.add(new Mobil("Brio", "Honda", "Dk 2345 kp"));
        mobilArrayList.add(new Mobil("Hrv", "Honda", "Dk 2143 kl"));
    }

}