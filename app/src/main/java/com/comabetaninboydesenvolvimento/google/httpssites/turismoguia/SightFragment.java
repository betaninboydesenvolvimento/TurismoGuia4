package com.comabetaninboydesenvolvimento.google.httpssites.turismoguia;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucas on 26/01/2018.
 */

public class SightFragment extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);
        final List<Place> places = new ArrayList<>();
        places.add(new Place(R.string.praçateixerinha, R.string.teixerinha, 0, 30948, R.drawable.teixeiriha));
        places.add(new Place(R.string.rodeio, R.string.parque, 25, 170984, R.drawable.parque_de_rodeios_roselandia));
        places.add(new Place(R.string.catedralpf, R.string.catedral, 0, 21433, R.drawable.catedral));
        places.add(new Place(R.string.ctgdesc, R.string.ctg, 12, 84732, R.drawable.ctg_marca_gaucha));

        PlaceAdapter itemsAdapter = new PlaceAdapter(getActivity(), (ArrayList<Place>) places);

        final ListView listView = (ListView) rootView.findViewById(R.id.places_list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}