def quick_sort(temp_list):
    if len(temp_list) <= 1: return temp_list
    pivot = temp_list[len(temp_list)/2 - (1 if len(temp_list) % 2 == 0 else 0) ]
    print pivot
    l_list = list()
    g_list = list()
    m_list = list()
    for e in temp_list:
      if e < pivot:
        l_list.append(e)
      elif e > pivot:
        g_list.append(e)
      else:
        m_list.append(e)
    return (quick_sort(l_list)+ m_list+ quick_sort(g_list))


print quick_sort([12,4,5,6,34,7,3,1,15])

