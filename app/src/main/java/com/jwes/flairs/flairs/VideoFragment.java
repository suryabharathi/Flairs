package com.jwes.flairs.flairs;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class VideoFragment extends Fragment {

    private VideoFragment.OnFragmentInteractionListener mListener;

    public static VideoFragment newInstance() {
    VideoFragment fragment = new VideoFragment();
    return fragment;
}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_video, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof VideoFragment.OnFragmentInteractionListener) {
            mListener = (VideoFragment.OnFragmentInteractionListener) context;
        } else {
            Toast.makeText(context, "Video Fragment", Toast.LENGTH_SHORT).show();
        }
    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }


}
