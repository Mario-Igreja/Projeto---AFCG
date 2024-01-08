import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import javax.annotation.Nullable;

public class BaseAdapter extends ArrayAdapter<Exercise> {

        public YourCustomAdapter(Context context, List<Exercise> exerciseList) {
            super(context, 0, exerciseList);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            // Implemente a criação da visualização do item da lista aqui
            // Use o layout personalizado para os itens da lista
            // Exemplo: View listItemView = LayoutInflater.from(getContext()).inflate(R.layout.custom_list_item, parent, false);

            // Atualize a visualização com os dados do item na posição
            // Exemplo: TextView exerciseName = listItemView.findViewById(R.id.exerciseName);
            // exerciseName.setText(getItem(position).getName());

            return convertView;
        }
    }


