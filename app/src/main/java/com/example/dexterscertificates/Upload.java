package com.example.dexterscertificates;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.gms.common.internal.Constants;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;


public class Upload extends Fragment {

    private static final int RESULT_OK = 1;
    private Uri filePath;
    private final int PICK_IMAGE_REQUEST = 22;
    private FirebaseStorage storage;
    private StorageReference storageReference;
    private Button uploadTheme, uploadFile;

    public Upload() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_upload, container, false);
        storage = FirebaseStorage.getInstance();
        storageReference = storage.getReference();
        uploadTheme = view.findViewById(R.id.upload_theme);
        uploadFile = view.findViewById(R.id.upload_file);
        uploadTheme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
            }
        });
        return view;
    }

}