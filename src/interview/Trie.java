package interview;

import java.util.HashMap;
import java.util.Map;

public class Trie {

	private class TrieNode{
		Map<Character, TrieNode> children;
		boolean endOfWord;
		
		public TrieNode()
		{
			children = new HashMap<Character, TrieNode>();
			endOfWord = false;
		}
	}
	
	private final TrieNode root;
	
	public Trie()
	{
		root = new TrieNode();
	}
	
	public void insert(String word)
	{
		TrieNode current = root;
		for(int i=0; i< word.length();i++)
		{
			char ch = word.charAt(i);
			TrieNode node = current.children.get(ch);
			if(node == null)
			{
				node = new TrieNode();
				current.children.put(ch, node);
			}
			current = node;
		}
		current.endOfWord=true;
	}
	
	public boolean search(String word)
	{
		TrieNode current = root;
		for(int i=0; i< word.length(); i++)
		{
			char ch = word.charAt(i);
			
			TrieNode node = current.children.get(ch);
			if(node == null)
			{
				return false;
			}
			current = node;
		}
		
		return current.endOfWord;
	}
	public void delete(String word)
	{
		 boolean del = delete(word, root, 0);
	}
	
	public boolean delete(String word, TrieNode current, int index)
	{
		if(index == word.length())
		{
			if(!current.endOfWord)
				return false;
			
			current.endOfWord = false;
			return current.children.size() == 0;
		}
		
		char ch = word.charAt(index);
		TrieNode node  = current.children.get(ch);
		
		if(node == null)
		{
			return false;
		}
		boolean ShouldDeleteCurrentNode = delete(word, node, index+1);
		
		if(ShouldDeleteCurrentNode)
		{
			current.children.remove(ch);
			return (current.children.size() == 0 && (!current.endOfWord));
		}
		return false;
	}
	
	public static void main(String [] args)
	{
		Trie t = new Trie();
		t.insert("ab");
		t.insert("a");
		t.insert("abdl");
		t.insert("gph");
		
		System.out.println(t.search("ab"));
		System.out.println(t.search("a"));
		
		System.out.println("Deleting");
		//System.out.println(t.delete("abc"));
		//System.out.println(t.delete("adcd"));
		t.delete("ab");
		System.out.println(t.search("a"));
		System.out.println(t.search("ab"));
	}
}
