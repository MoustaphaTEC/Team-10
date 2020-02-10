package com.yoon.bi.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.yoon.bi.R;

import java.util.ArrayList;

public class SlideshowFragment extends Fragment implements AdapterView.OnItemSelectedListener {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_slideshow, container, false);
            Spinner spin1 = (Spinner)view.findViewById(R.id.spinner1);
            Spinner spin2 = (Spinner)view.findViewById(R.id.spinner2);
            Spinner spin3 = (Spinner)view.findViewById(R.id.spinner3);
            Spinner spin4 = (Spinner)view.findViewById(R.id.spinner4);
            Spinner spin5 = (Spinner)view.findViewById(R.id.spinner5);
            Spinner spin6 = (Spinner)view.findViewById(R.id.spinner6);
            Spinner spin7 = (Spinner)view.findViewById(R.id.spinner7);
            Spinner spin8 = (Spinner)view.findViewById(R.id.spinner8);
            Spinner spin9 = (Spinner)view.findViewById(R.id.spinner9);
            Spinner spin10 = (Spinner)view.findViewById(R.id.spinner10);
            Spinner spin11 = (Spinner)view.findViewById(R.id.spinner11);


        /*ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(view.getContext(),
                R.array.ligne1, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spin1.setAdapter(adapter);
        spin1.setOnItemSelectedListener(this);*/
        ArrayList<String> data = new ArrayList<>();
        data.add("Ligne 1 — HLM Grand Yoff ↔ Lat Dior");
        data.add("Itinéraire");
        data.add("Terminus HLM Grand Yoff (Face Autoroute) ==> Scat Urbam ==> ");
        data.add("Liberté 6 ==> Derklé ==> Liberté 4 ==> Rond Point Jet d'eau");
        data.add("==> Bourguiba ==> Grand Dakar ==> Fass Médina ==> Sham");
        data.add("==> Avenue Blaise Diagne ==> Terminus Lat Dior");
        data.add("------------------------------------------------");
        data.add("Point de départ / arrivée : Terminus Grand Yoff");
        data.add("Point de départ / arrivée : Terminus Lat Dior");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                getContext(), android.R.layout.simple_list_item_1,
                data
        );
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spin1.setAdapter(adapter);

        ArrayList<String> data2 = new ArrayList<>();
            data2.add("Ligne 2 — Parcelles Assainies ↔ Pétersen");
            data2.add("Itinéraire");
            data2.add("Terminus des Parcelles Assainies ==> Croisement 22");
            data2.add("==> Pont Aliou Sow ==> Rond point Liberté 6");
            data2.add("==> Castor ==> HLM ==> Colobane ==> Tilène ==>");
            data2.add("Avenue Blaise Diagne ==> Terminus Pétersen");
            data2.add("------------------------------------------------");
            data2.add("Point de départ / arrivée : Terminus des Parcelles Assainies");
            data2.add("Point de départ / arrivée : Terminus Pétersen");

        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(
                getContext(), android.R.layout.simple_list_item_1,
                data2
        );
        adapter2.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spin2.setAdapter(adapter2);

        ArrayList<String> data3 = new ArrayList<>();
        data3.add("Ligne 3 — Yoff Village ↔ Pétersen");
        data3.add("Itinéraire");
        data3.add("Terminus Yoff Village ==> Aéroport LSS ==> Route de Ngor ==>");
        data3.add("Almadies ==> Les Mamelles (Monument Renaissance) ==>");
        data3.add("Ouakam ==> Hôpital Fann ==> UCAD/ENDSS ==> Hôpital Abass Ndao");
        data3.add("==> Avenue Blaise DIAGNE ==> Terminus Pétersen");
        data3.add("-----------------------------------------------------------------");
        data3.add("Point de départ / arrivée : Terminus Yoff Village");
        data3.add("Point de départ / arrivée : Terminus Pétersen");

        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(
                getContext(), android.R.layout.simple_list_item_1,
                data3
        );
        adapter3.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spin3.setAdapter(adapter3);

        ArrayList<String> data4 = new ArrayList<>();
        data4.add("Ligne 4 — Yoff Village ↔ Pétersen");
        data4.add("Itinéraire");
        data4.add("Terminus Yoff Village ==> Route de L'Aéroport ==> Foire ==>");
        data4.add("VDN ( Voie de Dégagement Nord) ==> Avenue Cheikh Anta Diop (UCAD)");
        data4.add("==> Hôpital Abass Ndao ==> Tilène ==> Avenue Blaise Diange ==> Terminus Pétersen");
        data4.add("-----------------------------------------------------------------");
        data4.add("Point de départ / arrivée : Terminus Yoff Village");
        data4.add("Point de départ / arrivée : Terminus Pétersen");

        ArrayAdapter<String> adapter4 = new ArrayAdapter<>(
                getContext(), android.R.layout.simple_list_item_1,
                data4
        );
        adapter4.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spin4.setAdapter(adapter4);

        ArrayList<String> data5 = new ArrayList<>();
        data5.add("Ligne 5 — Parcelles Assainies ↔ Pétersen");
        data5.add("Itinéraire");
        data5.add("Terminus Parcelles ==> Croisement 22 ==> Pont Sénégal Emergent ==> Patte D'oie ==> Fourière ==> Castor ==> HLM ==> Colobane ==> Tilène ==> Avenue Blaise Diange ==> Terminus Pétersen");
        data5.add("-----------------------------------------------------------------");
        data5.add("Point de départ / arrivée : Terminus Parcelles");
        data5.add("Point de départ / arrivée : Terminus Pétersen");

        ArrayAdapter<String> adapter5 = new ArrayAdapter<>(
                getContext(), android.R.layout.simple_list_item_1,
                data5
        );
        adapter5.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spin5.setAdapter(adapter5);

        ArrayList<String> data6 = new ArrayList<>();
        data6.add("Ligne 24 — Guédiawaye ↔ Cheikh Anta Diop UCAD");
        data6.add("Itinéraire");
        data6.add("Terminus Guédiawaye ==> Sapeur Pompier Guédiawaye ==> Sonatel Guédiawaye ==> Marché Peund Lansar ==> Ecole Lansar (CEM Thiaroye Djiaddah Kao) ==> Tally Bou Bess ==> Bountou Pikine ==> Autoroute ==> Cité des Eaux ==> Station Castor ==> Jet d'eau ==> Bourguiba ==> Ecole Normale /Ecole Police ==> Hôpital Fann ==> Terminus Cheikh Anta Diop UCAD");
        data6.add("-----------------------------------------------------------------");
        data6.add("Point de départ / arrivée : Terminus Guédiawaye");
        data6.add("Point de départ / arrivée : Terminus Cheikh Anta Diop UCAD");

        ArrayAdapter<String> adapter6 = new ArrayAdapter<>(
                getContext(), android.R.layout.simple_list_item_1,
                data6
        );
        adapter6.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spin6.setAdapter(adapter6);

        ArrayList<String> data7 = new ArrayList<>();
        data7.add("Ligne 25 — Parcelles Assainies ↔ Pétersen");
        data7.add("Itinéraire");
        data7.add("Terminus des Parcelles Assainies ==> Foires ==> VDN ( voie de dégagement Nord) ==> Permance PDS ==> Mermoz ==> Hôpital Fann ==> UCAD/ENDSS ==> Hôpital Abass Ndao ==> Tilène ==> Poste Médina ==> Crédit Foncier ==> Terminus Pétersen");
        data7.add("-----------------------------------------------------------------");
        data7.add("Point de départ / arrivée : Terminus des Parcelles Assainies");
        data7.add("Point de départ / arrivée : Terminus Pétersen");

        ArrayAdapter<String> adapter7 = new ArrayAdapter<>(
                getContext(), android.R.layout.simple_list_item_1,
                data7
        );
        adapter7.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spin7.setAdapter(adapter7);

        ArrayList<String> data8 = new ArrayList<>();
        data8.add("Ligne 4 — Yoff Village ↔ Pétersen");
        data8.add("Itinéraire");
        data8.add("Terminus Yoff Village ==> Route de L'Aéroport ==> Foire ==>");
        data8.add("VDN ( Voie de Dégagement Nord) ==> Avenue Cheikh Anta Diop (UCAD)");
        data8.add("==> Hôpital Abass Ndao ==> Tilène ==> Avenue Blaise Diange ==> Terminus Pétersen");
        data8.add("-----------------------------------------------------------------");
        data8.add("Point de départ / arrivée : Terminus Yoff Village");
        data8.add("Point de départ / arrivée : Terminus Pétersen");

        ArrayAdapter<String> adapter8 = new ArrayAdapter<>(
                getContext(), android.R.layout.simple_list_item_1,
                data8
        );
        adapter8.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spin8.setAdapter(adapter8);

        ArrayList<String> data9 = new ArrayList<>();
        data9.add("Ligne 4 — Yoff Village ↔ Pétersen");
        data9.add("Itinéraire");
        data9.add("Terminus Yoff Village ==> Route de L'Aéroport ==> Foire ==>");
        data9.add("VDN ( Voie de Dégagement Nord) ==> Avenue Cheikh Anta Diop (UCAD)");
        data9.add("==> Hôpital Abass Ndao ==> Tilène ==> Avenue Blaise Diange ==> Terminus Pétersen");
        data9.add("-----------------------------------------------------------------");
        data9.add("Point de départ / arrivée : Terminus Yoff Village");
        data9.add("Point de départ / arrivée : Terminus Pétersen");

        ArrayAdapter<String> adapter9 = new ArrayAdapter<>(
                getContext(), android.R.layout.simple_list_item_1,
                data9
        );
        adapter9.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spin9.setAdapter(adapter9);

        ArrayList<String> data10 = new ArrayList<>();
        data10.add("Ligne 4 — Yoff Village ↔ Pétersen");
        data10.add("Itinéraire");
        data10.add("Terminus Yoff Village ==> Route de L'Aéroport ==> Foire ==>");
        data10.add("VDN ( Voie de Dégagement Nord) ==> Avenue Cheikh Anta Diop (UCAD)");
        data10.add("==> Hôpital Abass Ndao ==> Tilène ==> Avenue Blaise Diange ==> Terminus Pétersen");
        data10.add("-----------------------------------------------------------------");
        data10.add("Point de départ / arrivée : Terminus Yoff Village");
        data10.add("Point de départ / arrivée : Terminus Pétersen");

        ArrayAdapter<String> adapter10 = new ArrayAdapter<>(
                getContext(), android.R.layout.simple_list_item_1,
                data10
        );
        adapter10.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spin10.setAdapter(adapter10);

        ArrayList<String> data11 = new ArrayList<>();
        data11.add("Ligne 4 — Yoff Village ↔ Pétersen");
        data11.add("Itinéraire");
        data11.add("Terminus Yoff Village ==> Route de L'Aéroport ==> Foire ==>");
        data11.add("VDN ( Voie de Dégagement Nord) ==> Avenue Cheikh Anta Diop (UCAD)");
        data11.add("==> Hôpital Abass Ndao ==> Tilène ==> Avenue Blaise Diange ==> Terminus Pétersen");
        data11.add("-----------------------------------------------------------------");
        data11.add("Point de départ / arrivée : Terminus Yoff Village");
        data11.add("Point de départ / arrivée : Terminus Pétersen");

        ArrayAdapter<String> adapter11 = new ArrayAdapter<>(
                getContext(), android.R.layout.simple_list_item_1,
                data11
        );
        adapter11.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spin11.setAdapter(adapter11);




        return view;

    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = "okkkk";
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}