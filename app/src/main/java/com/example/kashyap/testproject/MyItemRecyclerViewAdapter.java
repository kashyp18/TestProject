package com.example.kashyap.testproject;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.kashyap.testproject.ItemFragment.OnListFragmentInteractionListener;
import com.example.kashyap.testproject.dummy.DummyContent.DummyItem;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link DummyItem} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyItemRecyclerViewAdapter extends RecyclerView.Adapter<MyItemRecyclerViewAdapter.ViewHolder> {

    private final List<NewsFeed> mValues;
    private final OnListFragmentInteractionListener mListener;
    private Context mContext;

    public MyItemRecyclerViewAdapter(List<NewsFeed> items, OnListFragmentInteractionListener listener,Context context) {
        mValues = items;
        mListener = listener;
        this.mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mUserName.setText(mValues.get(position).getUserName());
        holder.mSerialCount.setText(mValues.get(position).getTime());
        holder.mWasActive.setText(mValues.get(position).getCount());
        holder.mSampleText.setText(mValues.get(position).getText());
        String message = mValues.get(position).getText();
        int start=0,end = 0;
          while ( message.charAt(start) == '\n')
                 start++;

        for (int i=start; i<message.length();i++) {
            if (message.charAt(i)== '\n' ) {
                break;
            }
            end++;
        }

        Spannable wordtoSpan = new SpannableString(message);


        wordtoSpan.setSpan(new RoundedBackgroundSpan(mContext), start, start+end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        holder.mSampleText.setText(wordtoSpan);


        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {

                    mListener.onListFragmentInteraction(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mUserName;
        public final TextView mWasActive;
        public final TextView mSerialCount;
        public final TextView mSampleText;
     //   public final TextView mSampleText1;
        public NewsFeed mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mUserName = (TextView) view.findViewById(R.id.user_name);
            mWasActive = (TextView) view.findViewById(R.id.was_active);
            mSerialCount = (TextView) view.findViewById(R.id.serial_count);
            mSampleText = (TextView) view.findViewById(R.id.sample_text);
           // mSampleText1 = (TextView) view.findViewById(R.id.sample_text1);


        }


    }
}
