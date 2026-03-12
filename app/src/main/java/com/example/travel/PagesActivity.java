//package com.example.travel;
//
//import android.os.Bundle;
//import android.widget.EditText;
//import android.widget.ImageButton;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.viewpager2.widget.ViewPager2;
//
//public class PagesActivity extends AppCompatActivity {
//
//    ViewPager2 viewpager;
//    EditText searchbox;
//    ImageButton searchbtn;
//    PlaceAdapter adapter;
//
//    String[] titles = {
//            "Paris - The City of Lights",
//            "London - A Blend of History and Modernity",
//            "Tokyo - Tradition Meets Innovation",
//            "New York - The City That Never Sleeps"
//    };
//
//    int[] images = {
//            R.drawable.paris,
//            R.drawable.london,
//            R.drawable.tokyo,
//            R.drawable.newyork
//    };
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_pages);
//
//        viewpager = findViewById(R.id.viewpager);
//        searchbox = findViewById(R.id.searchbox);
//        searchbtn = findViewById(R.id.searchbtn);
//
//        // Set vertical swipe
//        viewpager.setOrientation(ViewPager2.ORIENTATION_VERTICAL);
//
//        // Set adapter
//        adapter = new PlaceAdapter(titles, images);
//        viewpager.setAdapter(adapter);
//
//        // Search functionality
//        searchbtn.setOnClickListener(v -> {
//            String query = searchbox.getText().toString().trim();
//            boolean found = false;
//
//            for (int i = 0; i < titles.length; i++) {
//                if (titles[i].toLowerCase().contains(query.toLowerCase())) {
//                    viewpager.setCurrentItem(i, true);
//                    found = true;
//                    break;
//                }
//            }
//
//            if (!found) {
//                searchbox.setError("Place not found");
//            }
//        });
//    }
//}
//
package com.example.travel;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

public class PagesActivity extends AppCompatActivity {

    ViewPager2 viewpager;
    EditText searchbox;
    ImageButton searchbtn;
    PlaceAdapter adapter;

    String[] titles = {
            "Paris, the capital of France, is a global center for art, fashion, gastronomy, and culture. Known as the \"City of Light,\" it's famous for iconic landmarks like the Eiffel Tower, Notre-Dame Cathedral, and the Louvre Museum. The Seine River flows through the city, dividing it into the Right and Left Banks, both rich in history and charm",
            "London, the historic capital of the United Kingdom, is a major global center for finance, culture, and transportation, known for its ancient landmarks like the Tower of London and iconic modern sites such as The Shard",
            "Tokyo, Japan's capital, blends futuristic innovation with deep-rooted tradition, housing historic temples alongside neon-lit skyscrapers. It's the world's most populous metropolis and a global center for culture, business, and technology. ",
            "New York City is the most populous U.S. city and a global center for finance, culture, and diplomacy, symbolized by landmarks like the Statue of Liberty. It's known for its linguistic diversity, with hundreds of languages spoken by its massive foreign-born population"
    };

    int[] mainImages = {
            R.drawable.paris,
            R.drawable.london,
            R.drawable.tokyo,
            R.drawable.newyork
    };

    // extra image for each page
    int[] extraImages = {
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pages);

        viewpager = findViewById(R.id.viewpager);
        searchbox = findViewById(R.id.searchbox);
        searchbtn = findViewById(R.id.searchbtn);

        // Set vertical swipe
        viewpager.setOrientation(ViewPager2.ORIENTATION_VERTICAL);

        // Set adapter
        adapter = new PlaceAdapter(titles, mainImages, extraImages);
        viewpager.setAdapter(adapter);

        // Search functionality
        searchbtn.setOnClickListener(v -> {
            String query = searchbox.getText().toString().trim();
            boolean found = false;

            for (int i = 0; i < titles.length; i++) {
                if (titles[i].toLowerCase().contains(query.toLowerCase())) {
                    viewpager.setCurrentItem(i, true);
                    found = true;
                    break;
                }
            }

            if (!found) {
                searchbox.setError("Place not found");
            }
        });
    }
}