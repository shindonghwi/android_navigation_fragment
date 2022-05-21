package wolf.shin.navigationfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import wolf.shin.navigationfragment.databinding.FragmentBlank2Binding

class BlankFragment2 : Fragment() {
    private lateinit var _binding: FragmentBlank2Binding
    private var param: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param = it.getString("param")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBlank2Binding.inflate(layoutInflater)
        return _binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        param?.let { _binding.textView2.append(it) }

    }
}