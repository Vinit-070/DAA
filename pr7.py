# Huffman Coding implementation in python
class Node:
    def __init__(self, freq, char, left=None, right=None):
        # frequency of each character/symbol
        self.freq = freq
 
        # name of the character 
        self.char = char
 
        # left node of current node
        self.left = left
 
        # right node of current node
        self.right = right
 
        # weightage of node (0/1)
        self.huffman = ''
 
# utility function to print huffman
# codes for all symbols in the newly
# created Huffman tree
 
def printNodes(node, val=''):
    # huffman code for the current node
    newVal = val + str(node.huffman)
 
    # if the node is not an edge node
    # then do a traversal to the tree to get the values
    if(node.left):
        printNodes(node.left, newVal)
    if(node.right):
        printNodes(node.right, newVal)
 
        # if the node is an edge node then
        # display its huffman code
    if(not node.left and not node.right):
        print(f"{node.char}   |  {newVal}")
 
 
# unique characters from the given stream of data
# chars = "abbcdbccdaabbeeebeab"
chars = input("Enter the string : ")
 
# frequency of each character
# calculated using the dictonary
dict_frequency={}
for i in  chars:
    if i in dict_frequency:
        dict_frequency[i]+=1
    else:
        dict_frequency[i]=1
#inserting all the frequencies into the frequency array
freq=[]
for i in dict_frequency:
    freq.append(dict_frequency[i])

 
# list of unused nodes
nodes = []
 

for x in range(len(freq)):
    # appending the characters and frequency of 
    # each character into the huffman tree as a leaf node
    nodes.append(Node(freq[x], chars[x]))
 
while len(nodes) > 1:
    # sort all the nodes in an 
    # ascending order with respect to frequency using lambda function
    nodes = sorted(nodes, key=lambda x: x.freq)
 
    # extract the smallest two nodes
    # and assign the values to the left and right child of the huffman tree
    left = nodes[0]
    right = nodes[1]
 
    # assign weightage to these nodes
    # assign the left node to 0 and the right node to 1
    left.huffman = 0
    right.huffman = 1
 
    # combining these two smallest nodes to make the 
    # new node and this new node will be the parent node to them.
    newNode = Node(left.freq+right.freq, left.char+right.char, left, right)
 
    # now remove these two nodes and add their parent
    nodes.remove(left)
    nodes.remove(right)
    nodes.append(newNode)
    # repeat this process until all the characters are inserted in the tree

# Printing the Huffman Tree which if formed
print("Huffman Code")

printNodes(nodes[0]) 
