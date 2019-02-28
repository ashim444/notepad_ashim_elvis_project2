//package com.example.ashimghimire.notepad;

//package com.example.ashimghimire.notepad.data;
package com.example.ashimghimire.notepad;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class NoteAdapter extends RecyclerView.Adapter <NoteAdapter.NoteHolder>{
    private List<Note> notes=new ArrayList<>();
    public void setNotes(List<Note> note){

        this.notes=note;
        notifyDataSetChanged();
    }

    @Override
    public NoteHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.note_item, parent, false);
        return new NoteHolder(itemView);
    }

    @Override
    public void onBindViewHolder(NoteHolder holder, int position) {

        Note noteNow=notes.get(holder.getAdapterPosition());

        holder.txtViewTitle.setText(noteNow.getNoteTitle());
        holder.  txtDescriptor.setText(noteNow.getNoteDescription());
        holder.txtPriority.setText(String.valueOf(noteNow.getNotePriority()));

    }

    @Override
    public int getItemCount() {
        return notes.size();
    }


    class NoteHolder extends RecyclerView.ViewHolder{

        private TextView txtViewTitle;
        private TextView txtDescriptor;
        private TextView txtPriority;

        public NoteHolder(View itemView) {
            super(itemView);
            txtViewTitle=itemView.findViewById(R.id.titleTxt);
            txtDescriptor=itemView.findViewById(R.id.desTxt);
            txtPriority=itemView.findViewById(R.id.prioTxt);
        }
    }

}
