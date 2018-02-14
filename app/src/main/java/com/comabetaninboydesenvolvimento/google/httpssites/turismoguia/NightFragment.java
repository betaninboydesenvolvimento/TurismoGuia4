package com.comabetaninboydesenvolvimento.google.httpssites.turismoguia;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by lucas on 26/01/2018.
 */

public class NightFragment extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Place> bars = new ArrayList<>();
        bars.add(new Place(R.string.krep, R.string.krepdesc, 42, 30948, R.drawable.kreps));
        bars.add(new Place(R.string.chico, R.string.chicodesc, 49, 170984, R.drawable.chico));
        bars.add(new Place(R.string.panoramico, R.string.panoramicodesc, 50, 21433, R.drawable.panoramico));
        bars.add(new Place(R.string.planalto, R.string.planaltodesc, 47, 84732, R.drawable.planalto));

        PlaceAdapter itemsAdapter = new PlaceAdapter(getActivity(), bars);

        final ListView listView = (ListView) rootView.findViewById(R.id.places_list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}