package wolf.shin.navigationfragment.wolf.presentation.screen3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import wolf.shin.navigationfragment.databinding.FragmentThirdBinding
import wolf.shin.navigationfragment.wolf.base.BaseFragment
import wolf.shin.navigationfragment.wolf.presentation.screen1.FirstFragmentDirections
import wolf.shin.navigationfragment.wolf.presentation.screen2.ThirdViewModel

class ThirdFragment : BaseFragment<FragmentThirdBinding, ThirdViewModel>() {
    override val viewModel: ThirdViewModel get() = ViewModelProvider(this)[ThirdViewModel::class.java]

    override fun getFragmentBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentThirdBinding {
        return FragmentThirdBinding.inflate(layoutInflater)
    }

    override fun initView() {
        binding.goToDetailButton.setOnClickListener {
            findNavController().navigate(directions = ThirdFragmentDirections.goToThirdDetail())
        }
    }
}