package vn.edu.usth.wordpress_mobile_app.Media;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import vn.edu.usth.wordpress_mobile_app.Comment.Comment;
import vn.edu.usth.wordpress_mobile_app.Media.RecAdapter;
import vn.edu.usth.wordpress_mobile_app.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AllFrag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AllFrag extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AllFrag() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment all.
     */
    // TODO: Rename and change types and number of parameters
    public static AllFrag newInstance(String param1, String param2) {
        AllFrag fragment = new AllFrag();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.media_fragment_all, container, false);

        // Find RecyclerView and ensure it matches the ID in XML layout
        RecyclerView recyclerView = rootView.findViewById(R.id.recViewMedia);
        if (recyclerView == null) {
            throw new RuntimeException("RecyclerView not found in fragment_approved layout.");
        }

        // Populate the comment list with sample data
        List<Media> mediaList = new ArrayList<>();
        mediaList.add(new Media(R.drawable.cat1));
        mediaList.add(new Media(R.drawable.cat1));
        mediaList.add(new Media(R.drawable.cat1));
        mediaList.add(new Media(R.drawable.cat1));
        mediaList.add(new Media(R.drawable.cat1));

        // Set up the adapter and layout manager for RecyclerView
        RecAdapter recAdapter = new RecAdapter(mediaList);
        recyclerView.setAdapter(recAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),3));

        return rootView;
    }
}