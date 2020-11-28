package alisha.digipodium.civilwar;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment {

    ImageView cap_america,iron_man;
    Button btnCap,btnIron;
    Animation animation;
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        cap_america = (ImageView)view.findViewById(R.id.cap_america);
        iron_man = (ImageView)view.findViewById(R.id.iron_man);
        btnCap = (Button)view.findViewById(R.id.btnCap);
        btnIron = (Button)view.findViewById(R.id.btnIron);
        final TextView textView = view.findViewById(R.id.textView);
        ConstraintLayout constraintLayout = view.findViewById(R.id.con);
        final ImageView war =view.findViewById(R.id.war);
        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.animate().
                        setInterpolator(new LinearInterpolator())
                        .translationX(2000f)
                        .setDuration(900)
                        .start();
            }
        });

        btnCap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cap_america.animate()
                        .scaleY(2.0f)
                        .translationX(600f)
                        .setDuration(600)
                        .rotation(360)
                        .setInterpolator(new LinearInterpolator())
                        .start();
            }
        });

        btnIron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iron_man.animate()
                        .scaleY(2.0f)
                        .translationX(-600f)
                        .setDuration(600)
                        .rotation(360)
                        .setInterpolator(new LinearInterpolator())
                        .start();
            }
        });
    }
}