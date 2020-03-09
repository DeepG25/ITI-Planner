package royal.com.itiplanner;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class SearchFragment extends Fragment
{

    Button filterBtn;

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_search,container,false);

        filterBtn = rootView.findViewById(R.id.filter_button);
        filterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Filter selected", Toast.LENGTH_SHORT).show();
                //Intent i = new Intent(rootView.getContext(),Filterpopup.class);
            }
        });

        //Toast.makeText(getActivity(), "Search:-Under Development", Toast.LENGTH_SHORT).show();
        return rootView;
    }
}
