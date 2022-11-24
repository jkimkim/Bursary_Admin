package com.jkimtech.bursaryadmin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textview.MaterialTextView;

import java.util.List;

public class AdminAdapter extends RecyclerView.Adapter<AdminAdapter.Holder> {
    private Context context;
    private List<Upload> uploadList;
    private ClickListener listener;
    private List<User> userList;

    public AdminAdapter(Context context, List<Upload> uploadList, ClickListener listener) {
        this.context = context;
        this.uploadList = uploadList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.applicant_data, parent, false);
        Holder holder = new Holder(view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onclick(uploadList.get(holder.getAdapterPosition()));
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        Upload upload = uploadList.get(position);
        holder.statusView.setText("Status:"+ upload.getStatus());
        holder.DateView.setText(upload.getAppDate());
        holder.IdView.setText(upload.getUploadId());
        holder.nameView.setText(String.format("Name:%s", upload.getName()));
        holder.emailView.setText(upload.getEmail());
        holder.phoneView.setText(upload.getPhone());
        holder.adnoView.setText(upload.getAdmNo());
        holder.courseView.setText(upload.getCourse());
        holder.institutionView.setText(upload.getInstitution());
        holder.institutionPhoneView.setText(upload.getInstitutionPhoneNo());
        holder.bankView.setText(upload.getBankName());
        holder.accountNameView.setText(upload.getBankAccountNo());
        holder.branchView.setText(upload.getBankBranch());
        holder.districtView.setText(upload.getDistrict());
        holder.divisionView.setText(upload.getDivision());
        holder.villageView.setText(upload.getVillage());
        holder.wardView.setText(upload.getWard());
        holder.locationView.setText(upload.getLocation());
        holder.subLocationView.setText(upload.getSubLocation());
        holder.constituencyView.setText(upload.getConstituency());
        holder.dobView.setText(upload.getDate());

    }

    @Override
    public int getItemCount() {
        return uploadList.size();
    }

    public static class Holder extends RecyclerView.ViewHolder {
        MaterialTextView IdView, DateView, statusView, nameView, adnoView, courseView, emailView, phoneView, institutionView, institutionPhoneView, bankView, branchView, accountNameView,districtView, divisionView, locationView, wardView, constituencyView, subLocationView, villageView, dobView;

        public Holder(@NonNull View itemView) {
            super(itemView);
            IdView = itemView.findViewById(R.id.applicationId);
            DateView = itemView.findViewById(R.id.applicationDate);
            statusView = itemView.findViewById(R.id.applicationStatus);
            nameView = itemView.findViewById(R.id.name);
            emailView = itemView.findViewById(R.id.email_address);
            phoneView = itemView.findViewById(R.id.phone_number);
            adnoView = itemView.findViewById(R.id.admission_number);
            courseView = itemView.findViewById(R.id.course);
            institutionView = itemView.findViewById(R.id.institution_details);
            institutionPhoneView = itemView.findViewById(R.id.institution_number);
            bankView = itemView.findViewById(R.id.bank_name);
            branchView = itemView.findViewById(R.id.bank_branch);
            accountNameView = itemView.findViewById(R.id.bank_account_number);
            districtView = itemView.findViewById(R.id.district);
            divisionView = itemView.findViewById(R.id.division);
            locationView = itemView.findViewById(R.id.location);
            wardView = itemView.findViewById(R.id.ward);
            constituencyView = itemView.findViewById(R.id.constituency);
            subLocationView = itemView.findViewById(R.id.sub_location);
            dobView = itemView.findViewById(R.id.dob);
            villageView = itemView.findViewById(R.id.village);
        }
    }
}