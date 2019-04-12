package online.kaivalya.btkit.kaivalya;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class Sponsors extends Fragment implements View.OnClickListener {

    RecyclerView recyclerView1;
    RecyclerView.Adapter adapter;
    List<listi_tem1> listi_tems;
    TextView textView;

    private CardView Android,Web_development,WorkShop1,WorkShop2;
    private Context mContext;
    private Activity mActivity;
    private PopupWindow mpopupWindow;
    private LinearLayout linearLayout;
    Dialog dialog;
    CardView cardView;
    TextView textView_close,textView_android,textView_web,textView_coming;
    String url="https://rcf-ttc.herokuapp.com/courses";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)  {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_sponsors, container, false);
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();

        recyclerView1 = v.findViewById(R.id.recycle1);
        recyclerView1.setHasFixedSize(true);
        recyclerView1.setLayoutManager(new LinearLayoutManager(getActivity()));

        listi_tems = new ArrayList<>();
        load();
       // cardView.setOnClickListener(this);
        textView = v.findViewById(R.id.close);

        return v;


    }

    private void load() {
        final ProgressDialog progressDialog = new ProgressDialog(getActivity());
        progressDialog.setMessage("Loading data...");
        progressDialog.show();

        JsonObjectRequest stringRequest = new JsonObjectRequest(Request.Method.GET, url,null, new
                Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        progressDialog.dismiss();

                        try {
                            // JSONObject jsonObject = new JSONObject(response);
                            JSONArray jsonArray = response.getJSONArray("CoursesList");


                            for(int i=0;i<jsonArray.length();i++)
                            {
                                JSONObject o = jsonArray.getJSONObject(i);
                                listi_tem1 item = new listi_tem1(

                                        o.getString("Course Title"),
                                        o.getString("Course Code"),
                                        o.getString("Duration"),
                                        o.getString("Course Coordinator"),
                                        o.getString("Frequency"),
                                        o.getString("Scheduled Dates"),
                                        o.getString("Course Category")
                                );
                                listi_tems.add(item);

                            }
                           adapter = new MyAdapter1(listi_tems,getActivity());
                            recyclerView1.setAdapter(adapter);


                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                progressDialog.dismiss();
                Toast.makeText(getActivity(), error.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });

        RequestQueue requestQueue = Volley.newRequestQueue(getActivity());
        requestQueue.add(stringRequest);


    }


    @Override
    public void onClick(View v) {


    }
}
