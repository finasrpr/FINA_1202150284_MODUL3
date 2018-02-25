package com.example.fina.fina_1202150284_modul3;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;



//Class Adapter ini Digunakan Untuk Mengatur Bagaimana Data akan Ditampilkan
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    //digunakan untuk menerima dan menyimpan list item
    private ArrayList<String> arrayListTitle, arrayListDesc;
    private ArrayList<Integer> arrayListGambar;

    //Membuat Konstruktor pada Class RecyclerViewAdapter
    RecyclerAdapter(ArrayList<String> arrayListTitle, ArrayList<String> arrayListDesc, ArrayList<Integer> arrayListGambar){
        this.arrayListTitle = arrayListTitle;
        this.arrayListDesc = arrayListDesc;
        this.arrayListGambar = arrayListGambar;
    }

    //ViewHolder Digunakan Untuk Menyimpan Referensi Dari View-View
    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView Title, Desc;
        private ImageView Gambar;
        private LinearLayout itemList;

        public ViewHolder(View itemView) {
            super(itemView);
            //Menginisialisasi View-View untuk kita gunakan pada RecyclerView
            Title = itemView.findViewById(R.id.title);
            Desc = itemView.findViewById(R.id.desc);
            Gambar = itemView.findViewById(R.id.gambar);
            itemList = itemView.findViewById(R.id.list_item);
        }
    }

    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Membuat View untuk Menyiapkan dan Memasang Layout yang Akan digunakan pada RecyclerView
        View V = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_list_product, parent,false);
        ViewHolder VH = new ViewHolder(V);
        return VH;
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.ViewHolder holder, final int position) {
        //Memanggil Nilai/Value Pada View-View Yang Telah Dibuat pada Posisi Tertentu
        final String title = arrayListTitle.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        final String desc = arrayListDesc.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        final Integer gambar = arrayListGambar.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        holder.Title.setText(title);// Mengambil text sesuai posisi yang telah ditentukan
        holder.Desc.setText(desc); // Mengambil text sesuai posisi yang telah ditentukan
        holder.Gambar.setImageResource(gambar); // Mengambil gambar sesuai posisi yang telah ditentukan
        //Membuat Aksi Saat List Ditekan
        holder.itemList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DetailActivity.class);
                String descs = "    Kandungan yang terdapat dalam air putih:\n" +
                        "\n" +
                        "1. Kalsium\n" +
                        "Menjaga kesehatan tulang dan gigi. Berperan penting dalam proses kontraksi, relaksasi otot, pembekuan darah, dan menunjang imunitas tubuh.\n" +
                        "\n" +
                        "2. Sodium\n" +
                        "Menjaga keseimbangan cairan tubuh. Menopang transmisi saraf, kontraksi otot, absorpsi glukosa, dan menjadi alat angkut zat gizi melalui membran sel.\n" +
                        "\n" +
                        "3. Magnesium\n" +
                        "Membantu proses pencernaan protein. Memelihara kesehatan otot dan sistem jaringan penghubung. Membantu menghilangkan timbunan lemak di dinding dalam pembuluh darah. Sebagai zat pembentuk sel darah merah berupa zat pengikat oksigen dan hemoglobin.\n" +
                        "\n" +
                        "4. Kalium\n" +
                        "Membantu pembentukan sel, pembentukan organ dalam tubuh dan jaringan.\n" +
                        "\n" +
                        "5. Bikarbonat\n" +
                        "Memelihara keseimbangan keasaman darah, menyokong proses pencernaan dalam perut.";
                switch (position){
                    case 0:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 7:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 8:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 9:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 10:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayListTitle.size();
    }
}
