package com.jagwarrx.stormy;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by jagwarrx on 7/4/16.
 */
public class AlertDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Oops! Sorry! ").setMessage("Trichy seems too hot to function. Please try again! All the best.")
                .setPositiveButton("Okay", null);
        AlertDialog dialog = builder.create();
        return dialog;
    }
}
