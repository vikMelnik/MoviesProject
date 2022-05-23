package come.geekbrains.mymoviesprogect.ui.main.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import come.geekbrains.mymoviesprogect.R
import come.geekbrains.mymoviesprogect.databinding.MainFragmentBinding
import come.geekbrains.mymoviesprogect.model.Movie
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainFragment : Fragment() {


    private val viewModel: MainViewModel by viewModel()
    private var _binding: MainFragmentBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = MainFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }


    private fun renderData(data: Any) {
        Toast.makeText(context, "data", Toast.LENGTH_LONG).show()
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    interface OnItemViewClickListener {

        fun onItemViewClick(movie: Movie)

    }

    companion object {
        fun newInstance() = MainFragment()
    }
}