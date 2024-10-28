<h2><a href="https://www.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1?page=1&category=sliding-window&sortBy=submissions">Count distinct elements in every window</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an array of integers and a number <strong>k</strong>. Find the count of distinct elements in every window of size <strong>k</strong> in the array.</span></p>
<p><strong><span style="font-size: 18px;">Examples:</span></strong></p>
<pre><strong><span style="font-size: 18px;">Input:</span></strong><span style="font-size: 18px;"> k = 4, arr[] = [1, 2, 1, 3, 4, 2, 3]
<strong>Output:  </strong>[3, 4, 4, 3]<strong>
Explanation: </strong>Window 1 of size k = 4 is
1 2 1 3. Number of distinct elements in
this window are 3.&nbsp;
Window 2&nbsp;of size k = 4 is&nbsp;2 1 3 4.&nbsp;</span><span style="font-size: 18px;">Number
of distinct elements in this window are 4.</span>
<span style="font-size: 18px;">Window 3&nbsp;of size k = 4 is&nbsp;1 3 4 2.&nbsp;</span><span style="font-size: 18px;">Number
of distinct elements in this window are 4.</span>
<span style="font-size: 18px;">Window 4&nbsp;of size k = 4 is&nbsp;</span><span style="font-size: 18px;">3 4 2 3.&nbsp;Number
of distinct elements in this window are 3.</span>
</pre>
<pre><strong><span style="font-size: 18px;">Input: </span></strong><span style="font-size: 18px;">k = 2, arr[] = [4, 1, 1]
<strong>Output: </strong>[2, 1]<br></span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>k = 3, arr[] = [1, 1, 1, 1, 1]
<strong>Output: </strong>[1, 1, 1]</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong></span><br><span style="font-size: 18px;">1 &lt;= k &lt;= arr.size() &lt;= 10<sup>5</sup></span><br><span style="font-size: 18px;">1 &lt;= arr[i] &lt;= 10<sup>5&nbsp;</sup>, for each valid i</span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Accolite</code>&nbsp;<code>Amazon</code>&nbsp;<code>Microsoft</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>sliding-window</code>&nbsp;<code>Hash</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;