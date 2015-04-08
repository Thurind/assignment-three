package com.maddux.assignmentthree;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by My Laptop on 4/7/2015.
 */
public class RecyclerViewFragment extends Fragment {

    private RecyclerView recyclerAlbums;

    public RecyclerViewFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // This decides which layout the fragment will use.
        return inflater.inflate(R.layout.fragment_recycler_view, container, false);
    }

    @Override
    // The view passed to us in this parameter contains all of the views we created in XML
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerAlbums = (RecyclerView) view.findViewById((R.id.recycler_albums));

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());

        recyclerAlbums.setLayoutManager(layoutManager);

        List<Album> albums = mockAlbums();

        recyclerAlbums.setAdapter(new AlbumAdapter(albums));

    }

    private List<Album> mockAlbums() {

        List<Album> albums = new ArrayList<>();
        albums.add(new Album("Endgame", "Rise Against", 7, 2010, "Not Sure"));

        return albums;
    }
}
