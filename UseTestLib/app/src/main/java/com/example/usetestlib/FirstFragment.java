package com.example.usetestlib;

import static android.content.ContentValues.TAG;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.usetestlib.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    static {
        try{
            System.loadLibrary("testlib");
        }catch (Throwable t){
            Log.d(TAG, "loadLibEeror"+t.toString());
        }finally {
            Log.d(TAG, "loadLibSuccessed");
        }
    }

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String str = "str";
        try {
            str = stringFromJNI();
        }catch (Throwable t){
            Log.d("TAG", "useLibFunError\n" + t.toString());
        }finally {
            Log.d("TAG", "stringFromJNI successed");
        }

        binding.textviewFirst.setText(str);
        binding.buttonFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    // TODO: 4/1/22 chengkang jni 不同的类和方法调用c方法，需要在 jni接口声明多个方法吗？
    //jni 方法名 = 使用者包名+类名+调用函数名
    public native String stringFromJNI();
}