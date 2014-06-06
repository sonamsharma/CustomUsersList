package com.codepath.example.newbootcamp;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class UsersAdapter extends ArrayAdapter<User>{

	public UsersAdapter(Context context,
			List<User> users) {
		super(context, 0, users);
		// TODO Auto-generated constructor stub
	}

	public View getView(int position, View convertView, ViewGroup parent){
		User user = getItem(position);    
		// Check if an existing view is being reused, otherwise inflate the view
		if (convertView == null) {
			convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_user, parent, false);
		}
		// Lookup view for data population
		TextView tvName = (TextView) convertView.findViewById(R.id.tvName);
		TextView tvHome = (TextView) convertView.findViewById(R.id.tvHometown);
		// Populate the data into the template view using the data object
		tvName.setText(user.getName());
		tvHome.setText(user.getHometown());

		return convertView; 
	}


}
