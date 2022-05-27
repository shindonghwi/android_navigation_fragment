package wolf.shin.navigationfragment.wolf.presentation.screen2.detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import wolf.shin.navigationfragment.databinding.FragmentSecondDetailBinding
import wolf.shin.navigationfragment.wolf.base.BaseFragment

class SecondDetailFragment : BaseFragment<FragmentSecondDetailBinding, SecondDetailViewModel>() {
    override val viewModel: SecondDetailViewModel get() = ViewModelProvider(this)[SecondDetailViewModel::class.java]

    override fun getFragmentBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentSecondDetailBinding {
        return FragmentSecondDetailBinding.inflate(layoutInflater)
    }

    override fun initView() {}
}