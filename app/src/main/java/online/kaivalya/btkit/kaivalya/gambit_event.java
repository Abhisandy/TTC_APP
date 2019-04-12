package online.kaivalya.btkit.kaivalya;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.sothree.slidinguppanel.SlidingUpPanelLayout;

/**
 * Created by HP on 28-03-2018.
 */

public class gambit_event  extends Fragment {
    private static final String TAG = "DemoActivity";
    private SlidingUpPanelLayout mLayout;
    ImageView imageView_y,imageView_d;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.event_gambit, container, false);
        return view;

    }
}
