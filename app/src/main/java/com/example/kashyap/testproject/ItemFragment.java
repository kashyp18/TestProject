package com.example.kashyap.testproject;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


import java.util.ArrayList;
import java.util.List;

/**
 * A fragment representing a list of Items.
 * <p/>
 * Activities containing this fragment MUST implement the {@link OnListFragmentInteractionListener}
 * interface.
 */
public class ItemFragment extends Fragment {

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 1;
    private OnListFragmentInteractionListener mListener;
    public static final List<NewsFeed> ITEMS = new ArrayList<NewsFeed>();

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ItemFragment() {
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static ItemFragment newInstance(int columnCount) {
        ItemFragment fragment = new ItemFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item_list, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.list);
        recyclerView.setAdapter(new MyItemRecyclerViewAdapter(fillDummyNews(), mListener,getContext()));
        recyclerView.addItemDecoration(new SimpleDividerItemDecoration(
                getContext()
        ));

        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnListFragmentInteractionListener) {
            mListener = (OnListFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnListFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    public interface OnListFragmentInteractionListener {
        // TODO: Update argument type and name
        void onListFragmentInteraction(NewsFeed item);
    }

    private List<NewsFeed> fillDummyNews () {
       NewsFeed newsFeed = new NewsFeed("Rahul","3 months ago", "1","\n" +
               "asdf\n" +
               "\n" +
               "\n" +
               "and testing reply");
        ITEMS.add(newsFeed);

         newsFeed = new NewsFeed("Rahul","3 months ago", "1","\n" +
                 "asdf\n" +
                 "\n" +
                 "\n" +
                 "and testing reply");
        ITEMS.add(newsFeed);

         newsFeed = new NewsFeed("Rahul","3 months ago", "1","\n" +
                 "asdf\n" +
                 "\n" +
                 "\n" +
                 "and testing reply");
        ITEMS.add(newsFeed);

         newsFeed = new NewsFeed("Rahul","3 months ago", "1","\n" +
                 "asdf\n" +
                 "\n" +
                 "\n" +
                 "and testing reply");
        ITEMS.add(newsFeed);

         newsFeed = new NewsFeed("Rahul","3 months ago", "1","\n" +
                 "asdf\n" +
                 "\n" +
                 "\n" +
                 "and testing reply");
        ITEMS.add(newsFeed);

         newsFeed = new NewsFeed("Rahul","3 months ago", "1","\n" +
                 "asdf\n" +
                 "\n" +
                 "\n" +
                 "and testing reply");
        ITEMS.add(newsFeed);

         newsFeed = new NewsFeed("Rahul","3 months ago", "1","\n" +
                 "asdf\n" +
                 "\n" +
                 "\n" +
                 "and testing reply");
        ITEMS.add(newsFeed);

         newsFeed = new NewsFeed("Rahul","3 months ago", "1","\n" +
                 "asdf\n" +
                 "\n" +
                 "\n" +
                 "and testing reply");
        ITEMS.add(newsFeed);

         newsFeed = new NewsFeed("Rahul","3 months ago", "1","\n" +
                 "asdf\n" +
                 "\n" +
                 "\n" +
                 "and testing reply");
        ITEMS.add(newsFeed);

         newsFeed = new NewsFeed("Rahul","3 months ago", "1",  "asdf\n" +
                 "\n" +
                 "\n" +
                 "and testing reply");
        ITEMS.add(newsFeed);

        return ITEMS;

    }
}
