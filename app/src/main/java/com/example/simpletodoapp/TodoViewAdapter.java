package com.example.simpletodoapp;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class TodoViewAdapter extends ArrayAdapter<String> {

  public TodoViewAdapter(Context context, String[] todos) {
    super(context, R.layout.todo_view, todos);
  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent) {

    View todo_view = convertView;
    if (todo_view == null) {
	  LayoutInflater inflater = LayoutInflater.from(getContext());
	  todo_view = inflater.inflate(R.layout.todo_view, parent, false);
	}

	String todo = getItem(position);

	TextView text = todo_view.findViewById(R.id.text);
	text.setTextColor(Color.parseColor("#ffffff"));
	text.setText(todo);
	return todo_view;
  }
}
