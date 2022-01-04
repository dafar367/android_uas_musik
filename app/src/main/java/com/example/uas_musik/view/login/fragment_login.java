package com.example.uas_musik.view.login;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.uas_musik.R;
import com.example.uas_musik.helper.SharedPreferenceHelper;
import com.example.uas_musik.view.MainActivity;
import com.google.android.material.textfield.TextInputLayout;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragment_login#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment_login extends Fragment {

    TextView RegisterBtn;

    TextInputLayout email_login,pass_login;
    Button sign_in_btn;

    private LoginViewModel loginViewModel;
    private SharedPreferenceHelper helper;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fragment_login() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragment_login.
     */
    // TODO: Rename and change types and number of parameters
    public static fragment_login newInstance(String param1, String param2) {
        fragment_login fragment = new fragment_login();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        email_login = view.findViewById(R.id.sign_in_email_input);
        pass_login = view.findViewById(R.id.sign_in_pass_input);
        sign_in_btn = view.findViewById(R.id.regist_button);

        RegisterBtn = view.findViewById(R.id.buttonlogin);
        RegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                NavDirections action;
                Bundle bundle=new Bundle();
                Navigation.findNavController(view).navigate(R.id.action_fragment_login_to_fragment_register, bundle);
                getActivity().finish();
            }
        });


        sign_in_btn.setOnClickListener(view1 -> {

            if (!email_login.getEditText().getText().toString().isEmpty()
                    && !pass_login.getEditText().getText().toString().isEmpty()){
                String email = email_login.getEditText().getText().toString().trim();
                String pass = pass_login.getEditText().getText().toString().trim();
////                loginViewModel.login(email,pass).observe(requireActivity(),tokenResponse -> {
//                    if(tokenResponse != null){
//                        helper.saveAccessToken(tokenResponse.getAuthorization());
//                        NavDirections actions = fragment_login.actionLoginFragrmentToProjectFragment2();
//
//                        Navigation.findNavController(view1).navigate(actions);
//                        Toast.makeText(fragment_login.this.requireActivity(), "login succes", Toast.LENGTH_SHORT).show();
//                    }else{
//                        Toast.makeText(fragment_login.this.requireActivity(), "login failed", Toast.LENGTH_SHORT).show();
//                    }
//                });
            }else{
                Toast.makeText(fragment_login.this.requireActivity(), "please input user and password", Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public void onStart() {
        super.onStart();
        ((MainActivity) getActivity()).getSupportActionBar().hide();
    }

    @Override
    public void onResume() {
        super.onResume();
        ((MainActivity) getActivity()).getSupportActionBar().hide();
    }

    @Override
    public void onStop() {
        super.onStop();
        ((MainActivity)getActivity()).getSupportActionBar().show();
    }
}