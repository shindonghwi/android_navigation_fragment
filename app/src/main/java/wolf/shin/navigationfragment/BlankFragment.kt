package wolf.shin.navigationfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import wolf.shin.navigationfragment.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {
    private lateinit var _binding: FragmentBlankBinding
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
        _binding = FragmentBlankBinding.inflate(layoutInflater)
        return _binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding.textView.setOnClickListener {
            view.findNavController().navigate(resId = R.id.blankFragment02, args = Bundle().apply { putString("param", "hi") })
        }
    }
}