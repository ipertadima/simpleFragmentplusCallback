package intent.intent.intent.fragmentsample;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentB extends Fragment {
    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_b, container, false);
      // addFragment(R.id.container, new FramentA());
        return view;
    }

    private void addFragment(@IdRes int container, Fragment fragment) {
        getChildFragmentManager().beginTransaction().add(container, fragment).commit();
    }
}
