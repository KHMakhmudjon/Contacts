package com.codemachine.contacts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ContactsViewAdapter extends ArrayAdapter<ContactsView> {

    public ContactsViewAdapter(@NonNull Context context, ArrayList<ContactsView> arrayList) {
        super(context, 0, arrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View currentItemView = convertView;

        if (currentItemView == null) {
            currentItemView = LayoutInflater.from(getContext()).inflate(R.layout.custom_list_view, parent, false);
        }

        ContactsView currentContact = getItem(position);

        TextView contactName = currentItemView.findViewById(R.id.contact_name);
        contactName.setText(currentContact.getName());

        TextView contactNumber = currentItemView.findViewById(R.id.contact_number);
        contactNumber.setText(currentContact.getNumber());

        return currentItemView;
    }
}
