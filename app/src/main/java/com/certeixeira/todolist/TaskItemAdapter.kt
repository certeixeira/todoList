package com.certeixeira.todolist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.certeixeira.todolist.databinding.TaskItemCellBinding

class TaskItemAdapter(
    private val taskitems: List<TaskItem>,
    private val clickListener: TaskItemClickListener
) : RecyclerView.Adapter<TaskItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskItemViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = TaskItemCellBinding.inflate(from, parent, false)
        return TaskItemViewHolder(parent.context, binding, clickListener)
    }

    override fun onBindViewHolder(holder: TaskItemViewHolder, position: Int) {
        holder.bindTaskItem(taskitems[position])
    }

    override fun getItemCount(): Int = taskitems.size
}