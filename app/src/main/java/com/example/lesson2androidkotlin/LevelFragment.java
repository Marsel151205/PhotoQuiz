package com.example.lesson2androidkotlin;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lesson2androidkotlin.databinding.FragmentLevelBinding;

public class LevelFragment extends Fragment {

    FragmentLevelBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentLevelBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnFirstLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("firstImage", "https://n1s1.hsmedia.ru/41/32/fa/4132fa01d4281d297a6b30eb745ea9e7/480x600_1_7661b47c30bd8cbf26521498d55fad20@1080x1350_0xac120003_1373514831640100058.jpeg");
                bundle.putString("secondImage", "https://w7.pngwing.com/pngs/941/980/png-transparent-death-grim-s-cartoon-fictional-character-reaper.png");
                bundle.putString("thirdImage", "https://total.kz/storage/ba/ba0acb96dcad8b65792c9ea04640e75a_resize_w_830_h_465.jpg");
                bundle.putString("fourImage", "https://thumbs.dreamstime.com/b/%D0%BA%D0%BE%D1%81%D0%B0-%D0%B4%D0%BB%D1%8F-%D0%BA%D0%BE%D1%81%D1%8F-%D1%82%D1%80%D0%B0%D0%B2%D1%8B-%D0%B8%D0%B7%D0%BE%D0%BB%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D0%B0%D1%8F-%D0%BD%D0%B0-%D0%B1%D0%B5%D0%BB%D0%BE%D0%B9-%D0%BF%D1%80%D0%B5%D0%B4%D0%BF%D0%BE%D1%81%D1%8B%D0%BB%D0%BA%D0%B5-108961289.jpg");
                bundle.putString("answer", "коса");
                bundle.putString("prompt", "То что носит с собой смерть, а также косят траву");
                bundle.putString("level", "1 Level");
                GameFragment gameFragment = new GameFragment();
                gameFragment.setArguments(bundle);

                requireActivity().getSupportFragmentManager().beginTransaction().replace(
                        R.id.main_activity, gameFragment).commit();
            }
        });

        binding.btnSecondLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("firstImage", "https://upload.wikimedia.org/wikipedia/commons/thumb/6/66/The_Leaning_Tower_of_Pisa_SB.jpeg/262px-The_Leaning_Tower_of_Pisa_SB.jpeg");
                bundle.putString("secondImage", "http://www.graycell.ru/picture/big/tarantella2.jpg");
                bundle.putString("thirdImage", "https://total.kz/storage/ba/ba0acb96dcad8b65792c9ea04640e75a_resize_w_830_h_465.jpg");
                bundle.putString("fourImage", "https://cdn.w600.comps.canstockphoto.ru/%D0%BC%D1%83%D0%BB%D1%8C%D1%82%D1%84%D0%B8%D0%BB%D1%8C%D0%BC-%D0%B8%D1%82%D0%B0%D0%BB%D1%8C%D1%8F%D0%BD%D1%81%D0%BA%D0%B8%D0%B9-%D1%88%D0%B5%D1%84-%D0%BF%D0%BE%D0%B2%D0%B0%D1%80-%D0%BA%D0%BB%D0%B8%D0%BF%D0%B0%D1%80%D1%82%D1%8B_csp5165301.jpg");
                bundle.putString("answer", "италия");
                bundle.putString("prompt", "Родина вкуснейшей пиццы");
                bundle.putString("level", "2 Level");
                GameFragment gameFragment = new GameFragment();
                gameFragment.setArguments(bundle);

                requireActivity().getSupportFragmentManager().beginTransaction().replace(
                        R.id.main_activity, gameFragment).commit();
            }
        });

        binding.btnThreeLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("firstImage", "https://militaryarms.ru/wp-content/uploads/2018/03/ohotnichi-ruzhya.jpg");
                bundle.putString("secondImage", "https://simple-fauna.ru/wp-content/uploads/2016/12/ohotnichi-porody-sobak.jpg");
                bundle.putString("thirdImage", "https://avatars.mds.yandex.net/get-kinopoisk-image/1777765/494ec31e-1780-4912-8981-70f671e73d65/600x900");
                bundle.putString("fourImage", "http://tile.loc.gov/image-services/iiif/service:gdc:gdclccn:20:18:68:57:37:2018685737:enr0001_04108/full/pct:100/0/default.jpg");
                bundle.putString("answer", "охота");
                bundle.putString("prompt", "Чем занимаются браканьеры?");
                bundle.putString("level", "3 Level");
                GameFragment gameFragment = new GameFragment();
                gameFragment.setArguments(bundle);

                requireActivity().getSupportFragmentManager().beginTransaction().replace(
                        R.id.main_activity, gameFragment).commit();
            }
        });
    }
}