package tugas.optionmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class About extends AppCompatActivity {
    WebView browser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        browser=(WebView)findViewById(R.id.about_apps);
        //Use same layout and manifest of previous example
        browser.loadData("" +
                "<html>" +
                "   <body>" +
                "  <title>About Aplikasi </title>" +
                "<p>" +
                "Aplikasi pencatatan waktu olahraga\n" +
                "Aplikasi ini dibuat oleh :<br/>" +
                "Firda Frianda(1406055)<br/>" +
                "Ahamad Arif Budiman (1406011)<br/>" +
                "</p>" +
                "</body>" +
                "</html>", "text/html","UTF-8");
    }
}
