package online.kaivalya.btkit.kaivalya;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by abhishek on 7/3/2018.
 */

public class MyAdapter1 extends RecyclerView.Adapter<MyAdapter1.ViewHolder> implements View.OnClickListener{
    List<listi_tem1> listi_tems;
    CardView cardView;
    Context context;
    Dialog dialog;
    TextView textView_close;


    public MyAdapter1(List<listi_tem1> listi_tems, Context context) {
        this.listi_tems= listi_tems;
        this.context = context;
    }

    @Override
    public MyAdapter1.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item1,parent,false);
       // cardView = v.findViewById(R.id.card);

        return new ViewHolder(v);

    }

    @Override
    public void onBindViewHolder(MyAdapter1.ViewHolder holder, int position) {
        listi_tem1 listi_tem = listi_tems.get(position);

        holder.textView_name.setText(listi_tem.getName());
        holder.textView_code.setText(listi_tem.getCode());
        holder.textView_designation.setText(listi_tem.getDesignation());
        holder.textView_phone.setText(listi_tem.getPhone());
        holder.textView_trainee.setText(listi_tem.getTrainee());
        holder.textView_dates.setText(listi_tem.getDates());
        holder.textView_category.setText(listi_tem.getCategory());
        //holder.textView_contents.setText(listi_tem.getContents());
    }

    @Override
    public int getItemCount() {
        return listi_tems.size();
    }

    @Override
    public void onClick(View v) {

    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView textView_name,textView_code,textView_designation,textView_phone,textView_trainee,textView_dates,textView_category,textView_contents;
        public ViewHolder(View itemView) {
            super(itemView);
            textView_name = itemView.findViewById(R.id.rcf_name);
            textView_code = itemView.findViewById(R.id.rcf_code);
            textView_designation = itemView.findViewById(R.id.rcf_designation);
            textView_phone = itemView.findViewById(R.id.rcf_phone);
            textView_trainee = itemView.findViewById(R.id.rcf_trainee);
            textView_dates = itemView.findViewById(R.id.rcf_dates);
            textView_category = itemView.findViewById(R.id.rcf_category);
         //   textView_contents = itemView.findViewById(R.id.contents);
        }
    }
}
