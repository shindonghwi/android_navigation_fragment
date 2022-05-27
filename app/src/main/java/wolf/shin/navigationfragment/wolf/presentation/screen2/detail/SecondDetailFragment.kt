package wolf.shin.navigationfragment.wolf.presentation.screen2.detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import wolf.shin.navigationfragment.databinding.FragmentSecondDetailBinding
import wolf.shin.navigationfragment.wolf.base.BaseFragment
import wolf.shin.navigationfragment.wolf.presentation.screen3.detail.ThirdDetailViewModel

class SecondDetailFragment : BaseFragment<FragmentSecondDetailBinding, ThirdDetailViewModel>() {
    override val viewModel: ThirdDetailViewModel get() = ViewModelProvider(this)[ThirdDetailViewModel::class.java]

    override fun getFragmentBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentSecondDetailBinding {
        return FragmentSecondDetailBinding.inflate(layoutInflater)
    }

    override fun initView() {}
}