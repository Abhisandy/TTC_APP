package online.kaivalya.btkit.kaivalya;

import android.app.LauncherActivity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by abhishek on 7/3/2018.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    List<listi_tem> listi_tems;
    Context context;

    public MyAdapter(List<listi_tem> listi_tems, Context context) {
        this.listi_tems= listi_tems;
        this.context = context;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
        listi_tem listi_tem = listi_tems.get(position);

        holder.textView_name.setText(listi_tem.getName());
        holder.textView_code.setText(listi_tem.getCode());
        holder.textView_designation.setText(listi_tem.getDesignation());
        holder.textView_phone.setText(listi_tem.getPhone());
        holder.textView_trainee.setText(listi_tem.getTrainee());
    }

    @Override
    public int getItemCount() {
        return listi_tems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView textView_name,textView_code,textView_designation,textView_phone,textView_trainee;
        public ViewHolder(View itemView) {
            super(itemView);
            textView_name = itemView.findViewById(R.id.rcf_name);
            textView_code = itemView.findViewById(R.id.rcf_code);
            textView_designation = itemView.findViewById(R.id.rcf_designation);
            textView_phone = itemView.findViewById(R.id.rcf_phone);
            textView_trainee = itemView.findViewById(R.id.rcf_trainee);
        }
    }
}
