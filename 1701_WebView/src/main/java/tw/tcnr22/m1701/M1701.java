package tw.tcnr22.m1701;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

public class M1701 extends AppCompatActivity {
    private static String MAP_URL = "file:///android_asset/20210305-maskmap.html";// 自建的html檔名
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m1701);
        setupViewComponent();
    }

    private void setupViewComponent() {
        webView=(WebView)findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(MAP_URL);

    }

    //====================================================
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                finish();
                break;
            case R.id.youtube:
                MAP_URL = "file:///android_asset/toto.html";
                setupViewComponent();
                break;
            case R.id.maskmap:
                MAP_URL = "file:///android_asset/20210305-maskmap.html";
                setupViewComponent();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}