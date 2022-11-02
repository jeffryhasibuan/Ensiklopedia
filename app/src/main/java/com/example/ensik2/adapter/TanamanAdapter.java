package com.example.ensik2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.ensik2.R;
import com.example.ensik2.databinding.TanamanItemLayoutBinding;
import com.example.ensik2.model.TanamanItem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TanamanAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    TanamanListener listener;
    private List<TanamanItem> originalData;
    Context context;
    private static final int LOADING = 0;
    private static final int ITEM = 1;
    private boolean isLoadingAdded = false;

    public TanamanAdapter(Context context) {
        this.context = context;
        originalData = new LinkedList<>();
    }

    public void filterList(ArrayList<TanamanItem> filterlist) {
        // below line is to add our filtered
        // list in our course array list.
        originalData = filterlist;
        // below line is to notify our adapter
        // as change in recycler view data.
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tanaman_item_layout, parent, false);
        return new ViewHolder(view);

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TanamanItemLayoutBinding binding;

        public ViewHolder(View view) {
            super(view);
            binding = TanamanItemLayoutBinding.bind(view);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        TanamanItem item = originalData.get(position);
        ViewHolder itemViewHolder = (ViewHolder) holder;

        itemViewHolder.binding.txtNamaTanaman.setText(item.getNama());
        itemViewHolder.binding.txtNamaLatinTanaman.setText(item.getNamaLatin());
        Glide.with(context).load(item.getGambar()).into(itemViewHolder.binding.imgTanaman);
    }

    public void setData(List<TanamanItem> movieList) {
        this.originalData = movieList;
    }

//    @Override
//    public void setData(List<DataItem> list) {
//        this.originalData = list;
//        super.setData(list);
//    }

    public List<TanamanItem> getDataOriginal() {
        return this.originalData;
    }

    public void addListener(TanamanListener listener) {
        this.listener = listener;
    }

    public interface TanamanListener {
        void onClick(TanamanItem data);
    }

    @Override
    public int getItemCount() {
        return originalData == null ? 0 : originalData.size();
    }

    @Override
    public int getItemViewType(int position) {
        return (position == originalData.size() - 1 && isLoadingAdded) ? LOADING : ITEM;
    }

    public void add(TanamanItem movie) {
        originalData.add(movie);
        notifyItemInserted(originalData.size() - 1);
    }

    public void addAll(List<TanamanItem> moveResults) {
        for (TanamanItem result : moveResults) {
            add(result);
        }
    }

    public void clear() {
        int size = originalData.size();
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                originalData.remove(0);
            }

            notifyItemRangeRemoved(0, size);
        }
    }

    public TanamanItem getItem(int position) {
        return originalData.get(position);
    }
}
